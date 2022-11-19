// Token bucket Algorithm 

public class TokenBucket {
    private final long maxBucketSize;
    private final long refillRate;

    private double currentBucketSize;
    private long lastRefilltimestamp;

    public TokenBucket(long maxBucketSize, long refillRate) {
        this.maxBucketSize = maxBucketSize;
        this.refillRate = refillRate;

        currentBucketSize = maxBucketSize; // number of tokens initiall is equal to max capacity
        lastRefilltimestamp = System.nanoTime(); // current time in nano seconds
    }

    public synchronized boolean allowRequest(int tokens) { // synchronized, as several threads may be calling the method
                                                           // concurrently
        refill(); // first, refill bucket with tokens accumulated since last call

        if (currentBucketSize < maxBucketSize) { // if bucket has enough tokens, call is allowed
            currentBucketSize -= tokens;

            return true;
        }
        return false; // request is throttled as bucket does not have enough tokens
    }

    public void refill() {
        long now = System.nanoTime();
        double tokentoAdd = (now - lastRefilltimestamp) * refillRate / 1e9; // These many tokens accumulated
                                                                            // since last refill
        currentBucketSize = Math.min(currentBucketSize + tokentoAdd, maxBucketSize); // Number of tokens should
                                                                                     // never exceed maximum
        lastRefilltimestamp = now;
    }

}
