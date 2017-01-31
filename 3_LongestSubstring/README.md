#3. Longest Substring Without Repeating Characters
Given a string, find the length of the **longest substring** without
repeating characters.

**Examples:**

Given "abcabcbb", the answer is "abc", which the length is 3.

Given "bbbbb", the answer is "b", with the length of 1.

Given "pwwkew", the answer is "wke", with the length of 3.

Note that theanswer must be a **substring**, "pwke" is a subsequence and
not a substring.

##Solution idea:
The basic idea is, keep a hashmap which stores the characters in string
as keys and their positions as values, and keep two pointers which
define the max substring. move the right pointer to scan through the
string , and meanwhile update the hashmap. If the character is already
in the hashmap, then move the left pointer to the right of the same
character last found. Note that the two pointers can only move forward.
