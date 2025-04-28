class Solution:
    def groupAnagrams(self, words: List[str]) -> List[List[str]]:
        map = defaultdict(list)

        for word in words:
            chars = [0] * 26
            for char in word:
                chars[ord(char) - ord('a')] += 1
            
            
            map[tuple(chars)].append(word)

        return list(map.values())

'''
Time Complexity: O(n)
Space Complexity: O(n)
'''