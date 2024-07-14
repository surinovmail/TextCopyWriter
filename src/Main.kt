import java.awt.Robot
import java.awt.event.KeyEvent

fun main() {
    val textToType = "qwertyuiopasdfghjklzxcvbnm!@#\$%^&*()_-+=/*-+<>,.?~`"

    val robot = Robot()

    Thread.sleep(2000)

    textToType.forEach { char ->
        typeCharacter(robot, char)
        Thread.sleep(10)
    }
}

fun typeCharacter(robot: Robot, character: Char) {
    when (character) {
        in 'a'..'z' -> {
            robot.keyPress(KeyEvent.VK_A + character.code - 'a'.code)
            robot.keyRelease(KeyEvent.VK_A + character.code - 'a'.code)
        }
        in 'A'..'Z' -> {
            robot.keyPress(KeyEvent.VK_SHIFT)
            robot.keyPress(KeyEvent.VK_A + character.code - 'A'.code)
            robot.keyRelease(KeyEvent.VK_A + character.code - 'A'.code)
            robot.keyRelease(KeyEvent.VK_SHIFT)
        }
        in '0'..'9' -> {
            robot.keyPress(KeyEvent.VK_0 + character.code - '0'.code)
            robot.keyRelease(KeyEvent.VK_0 + character.code - '0'.code)
        }
        ' ' -> {
            robot.keyPress(KeyEvent.VK_SPACE)
            robot.keyRelease(KeyEvent.VK_SPACE)
        }
        ',' -> {
            robot.keyPress(KeyEvent.VK_COMMA)
            robot.keyRelease(KeyEvent.VK_COMMA)
        }
        '.' -> {
            robot.keyPress(KeyEvent.VK_PERIOD)
            robot.keyRelease(KeyEvent.VK_PERIOD)
        }
        '!' -> {
            robot.keyPress(KeyEvent.VK_SHIFT)
            robot.keyPress(KeyEvent.VK_1)
            robot.keyRelease(KeyEvent.VK_1)
            robot.keyRelease(KeyEvent.VK_SHIFT)
        }
        '-' -> {
            robot.keyPress(KeyEvent.VK_MINUS)
            robot.keyRelease(KeyEvent.VK_MINUS)
        }
        '\n' -> {
            robot.keyPress(KeyEvent.VK_ENTER)
            robot.keyRelease(KeyEvent.VK_ENTER)
        }
        '"' -> {
            robot.keyPress(KeyEvent.VK_SHIFT)
            robot.keyPress(KeyEvent.VK_QUOTE)
            robot.keyRelease(KeyEvent.VK_QUOTE)
            robot.keyRelease(KeyEvent.VK_SHIFT)
        }
        '\'' -> {
            robot.keyPress(KeyEvent.VK_QUOTE)
            robot.keyRelease(KeyEvent.VK_QUOTE)
        }
        ':' -> {
            robot.keyPress(KeyEvent.VK_SHIFT)
            robot.keyPress(KeyEvent.VK_SEMICOLON)
            robot.keyRelease(KeyEvent.VK_SEMICOLON)
            robot.keyRelease(KeyEvent.VK_SHIFT)
        }
        ';' -> {
            robot.keyPress(KeyEvent.VK_SEMICOLON)
            robot.keyRelease(KeyEvent.VK_SEMICOLON)
        }
        '?' -> {
            robot.keyPress(KeyEvent.VK_SHIFT)
            robot.keyPress(KeyEvent.VK_SLASH)
            robot.keyRelease(KeyEvent.VK_SLASH)
            robot.keyRelease(KeyEvent.VK_SHIFT)
        }
        '(' -> {
            robot.keyPress(KeyEvent.VK_SHIFT)
            robot.keyPress(KeyEvent.VK_9)
            robot.keyRelease(KeyEvent.VK_9)
            robot.keyRelease(KeyEvent.VK_SHIFT)
        }
        ')' -> {
            robot.keyPress(KeyEvent.VK_SHIFT)
            robot.keyPress(KeyEvent.VK_0)
            robot.keyRelease(KeyEvent.VK_0)
            robot.keyRelease(KeyEvent.VK_SHIFT)
        }
        '@' -> {
            robot.keyPress(KeyEvent.VK_SHIFT)
            robot.keyPress(KeyEvent.VK_2)
            robot.keyRelease(KeyEvent.VK_2)
            robot.keyRelease(KeyEvent.VK_SHIFT)
        }
        '#' -> {
            robot.keyPress(KeyEvent.VK_SHIFT)
            robot.keyPress(KeyEvent.VK_3)
            robot.keyRelease(KeyEvent.VK_3)
            robot.keyRelease(KeyEvent.VK_SHIFT)
        }
        '$' -> {
            robot.keyPress(KeyEvent.VK_SHIFT)
            robot.keyPress(KeyEvent.VK_4)
            robot.keyRelease(KeyEvent.VK_4)
            robot.keyRelease(KeyEvent.VK_SHIFT)
        }
        '%' -> {
            robot.keyPress(KeyEvent.VK_SHIFT)
            robot.keyPress(KeyEvent.VK_5)
            robot.keyRelease(KeyEvent.VK_5)
            robot.keyRelease(KeyEvent.VK_SHIFT)
        }
        '^' -> {
            robot.keyPress(KeyEvent.VK_SHIFT)
            robot.keyPress(KeyEvent.VK_6)
            robot.keyRelease(KeyEvent.VK_6)
            robot.keyRelease(KeyEvent.VK_SHIFT)
        }
        '&' -> {
            robot.keyPress(KeyEvent.VK_SHIFT)
            robot.keyPress(KeyEvent.VK_7)
            robot.keyRelease(KeyEvent.VK_7)
            robot.keyRelease(KeyEvent.VK_SHIFT)
        }
        '*' -> {
            robot.keyPress(KeyEvent.VK_SHIFT)
            robot.keyPress(KeyEvent.VK_8)
            robot.keyRelease(KeyEvent.VK_8)
            robot.keyRelease(KeyEvent.VK_SHIFT)
        }
        '_' -> {
            robot.keyPress(KeyEvent.VK_SHIFT)
            robot.keyPress(KeyEvent.VK_MINUS)
            robot.keyRelease(KeyEvent.VK_MINUS)
            robot.keyRelease(KeyEvent.VK_SHIFT)
        }
        '+' -> {
            robot.keyPress(KeyEvent.VK_SHIFT)
            robot.keyPress(KeyEvent.VK_EQUALS)
            robot.keyRelease(KeyEvent.VK_EQUALS)
            robot.keyRelease(KeyEvent.VK_SHIFT)
        }
        '=' -> {
            robot.keyPress(KeyEvent.VK_EQUALS)
            robot.keyRelease(KeyEvent.VK_EQUALS)
        }
        '/' -> {
            robot.keyPress(KeyEvent.VK_SLASH)
            robot.keyRelease(KeyEvent.VK_SLASH)
        }
        '<' -> {
            robot.keyPress(KeyEvent.VK_SHIFT)
            robot.keyPress(KeyEvent.VK_COMMA)
            robot.keyRelease(KeyEvent.VK_COMMA)
            robot.keyRelease(KeyEvent.VK_SHIFT)
        }
        '>' -> {
            robot.keyPress(KeyEvent.VK_SHIFT)
            robot.keyPress(KeyEvent.VK_PERIOD)
            robot.keyRelease(KeyEvent.VK_PERIOD)
            robot.keyRelease(KeyEvent.VK_SHIFT)
        }
        '`' -> {
            robot.keyPress(KeyEvent.VK_BACK_QUOTE)
            robot.keyRelease(KeyEvent.VK_BACK_QUOTE)
        }
        '~' -> {
            robot.keyPress(KeyEvent.VK_SHIFT)
            robot.keyPress(KeyEvent.VK_BACK_QUOTE)
            robot.keyRelease(KeyEvent.VK_BACK_QUOTE)
            robot.keyRelease(KeyEvent.VK_SHIFT)
        }
        else -> {
            println("Noma'lum belgi: $character")
        }
    }
}
