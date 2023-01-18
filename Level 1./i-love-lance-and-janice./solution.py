def solution(x):
    decrpyted_msg = ''
    for y in range(len(x)):
        char = x[y]

        # for each lowercase character, get its reversed position
        # in unicode code points and append the resultant character
        if 'a' <= char <= 'z':
            decrypted_msg += chr(ord('a') + 25 - (ord(char) - ord('a')))
        else:
            decrypted_msg += char

    return decrypted_msg
