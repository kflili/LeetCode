#242. Valid Anagram
Given two strings s and t, write a function to determine if t is an
anagram of s.

For example, s = "anagram", t = "nagaram", return true. s = "rat", t =
"car", return false.

**Note:** You may assume the string contains only lowercase alphabets.

**Follow up:** What if the inputs contain unicode characters? How would
you adapt your solution to such case?

##Solution idea:
The idea is simple. It creates a size 26 int arrays as buckets for each
letter in alphabet. It increments the bucket value with String s and
decrement with string t. So if they are anagrams, all buckets should
remain with initial value which is zero. So just checking that and return