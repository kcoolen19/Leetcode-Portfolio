if n == 0:
  return 1
result = 1.0
if n < 0:
  x = 1 / x
  n = -n
while n > 0:
  if n & 1 == 1:
    result *= x
  x *= x
  n >>= 1
return result
