#8. String to Integer (atoi)
Implement atoi to convert a string to an integer.

**Hint:** Carefully consider all possible input cases. If you want a
challenge, please do not see below and ask yourself what are the
possible input cases.

**Notes:** It is intended for this problem to be specified vaguely (ie, no
given input specs). You are responsible to gather all the input
requirements up front.

##Solution idea:

We need to handle four cases:

1. discards all leading whitespaces
2. sign of the number
3. overflow
4. invalid input

We should always check `i < len` otherwise index may be out of range.