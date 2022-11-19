## API Rate Limiting
Rate limiting is a strategy to limit the access to APIs. It restricts the number of API calls that a client can make within any given timeframe. This helps to defend the API against abuse, both unintentional and malicious scripts.

Rate limits are often applied to an API by tracking the IP address, API keys or access tokens, etc. As an API developers, we can choose to respond in several different ways when a client reaches the limit.

Queueing the request until the remaining time period has elapsed.
- Allowing the request immediately but charging extra for this request.
- Most common one is rejecting the request (HTTP 429 Too Many Requests)

## Token Bucket Algorithm
Assume that we have a bucket, the capacity is defined as the number of tokens that it can hold. Whenever a consumer wants to access an API endpoint, it must get a token from the bucket. Token is removed from the bucket if it’s available and accept the request. If the token is not available then the server rejects the request.

As requests are consuming tokens, we also need to refill them at some fixed rate and time, such that we never exceed the capacity of the bucket. Let’s consider an API that has a rate limit of 100 requests per minute. We can create a bucket with a capacity of 100, and a refill rate of 100 tokens per minute.

