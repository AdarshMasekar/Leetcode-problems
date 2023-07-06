letters = {
            2: "abc",
            3: "def",
            4: "ghi",
            5: "jkl",
            6: "mno",
            7: "pqrs",
            8: "tuv",
            9: "wxyz"
}

class Solution(object):
    def letterCombinations(self, digits):
        
        if digits == "":
            return ""
        
        if len(digits) == 1:
            return list(letters[int(digits[0])])
        
        
        combinations = []
        
        first_digit_letters = letters[int(digits[0])]
        rec_combinations = self.letterCombinations(digits[1:])    # letter combinations from 2nd digit

        for letter in first_digit_letters:
            for comb in rec_combinations:
                combinations.append(letter + comb)
        
        return combinations
