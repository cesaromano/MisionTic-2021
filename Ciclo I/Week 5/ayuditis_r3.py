#reto 3 var 2

def definitions(character):

    #Recorre los caracteres y sus equivalencias

    dictionary = {'.-' : 'A', '-...' : 'B', '-.-.' : 'C', '-..' : 'D', '.' : 'E', '..-.' : 'F', '--.' : 'G', 
    '....' : 'H', '..' : 'I', '.---' : 'J', '-.-' : 'K', '.-..' : 'L', '--' : 'M', '-.' : 'N', '---' : 'O',
    '.--.' : 'P', '--.-' : 'Q', '.-.' : 'R', '...' : 'S', '-' : 'T', '..-' : 'U', '...-' : 'V', '.--' : 'W',
    '-..-' : 'X', '-.--' : 'Y', '--..' : 'Z', '/' : ' '}

    char_definition = dictionary.get(character)

    return char_definition

def translation(mensaje_a_traducir):

    str_to_list = mensaje_a_traducir.split()

    message_translated_list = []

    for character in str_to_list:
        char_translation = definitions(character)
        message_translated_list.append(char_translation)

    message_translated_str = "".join(message_translated_list)

    return message_translated_str

mensaje_1 = ".... --- .-.. .- / -- ..- -. -.. ---"
string_1 = translation(mensaje_1)
print(string_1)

mensaje_2 = "-. --- ... / .... .- -. / .--. .. -.-. .- -.. --- / -.. --- ... / -- --- ... --.- ..- .. - --- ..."
string_2 = translation(mensaje_2)
print(string_2)

mensaje_3 = ".... . -- --- ... / . -. -.-. --- -. - .-. .- -.. --- / ..- -. .- / .--. .-.. .- -. - .- / -. ..- -. -.-. .- / .- -. - . ... / ...- .. ... - .-"
string_3 = translation(mensaje_3)
print(string_3)

mensaje_4 = "- . -. . -- --- ... / -.-. --- -- .. -.. .- / .--. .- .-. .- / - .-. . ... / -.. .. .- ... / -- .- ..."
string_4 = translation(mensaje_4)
print(string_4)