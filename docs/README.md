# User Guide

Hammy chatbot is an application for people to navigate their tasks in daily lives. It consists of a variety of tasks, including Todo, Deadline and Event tasks. Besides, Hammy chatbot also includes other features, such as list, mark and unmark to help you control your tasks more effeciently. Most importantly, it is user-friendly and easy-to-use!

* How to read?
* Features
  * Viewing all available commands within application
  * Listing all tasks
  * Adding tasks
  * Deleting tasks
  * Marking tasks as done
  * Marking tasks as undone
  * Other listing tasks methods
  * Say Hi To Me <3
  * Surprised!
* FAQ
* Future Updates?


## Features 

### Viewing all available commands within application
To view all available commands within application, we can enter `help` to in the user input to list out all commands.

Command:
```
help
```


### Listing all tasks
You can list all your tasks using the `list` command.

Command:
```
list
```

Shortcut:
```
/ls
```

> [!NOTE]
> If there is no tasks in the list, Hammy will output `There is no tasks currently!` instead


### Adding tasks
There are three types of tasks
1. todo: A task with a description
2. deadline: A task with a Deadline date
3. event: A task with a From date and a to Date

**Adding todo tasks:**
```
todo YOUR_DESCRIPTION_HERE
```

Shortcut:
```
/t YOUR_DESCRIPTION_HERE
```

Expected outcome:
```
Got it. I have added:
[T][ ] YOUR_DESCRIPTION_HERE
```

**Adding deadline tasks:**
```
deadline [YOUR_DESCRIPTION_HERE] /by: XXXX-XX-XX
```

Shortcut:
```
/d [YOUR_DESCRIPTION_HERE] /by: XXXX-XX-XX
```

Expected outcome:
```
Got it. I have added:
[D][ ] YOUR_DESCRIPTION_HERE (by: XX XXX XXXX)
```

> [!NOTE]
> For deadline tasks, description is optional.

**Adding event tasks:**
```
event [YOUR_DESCRIPTION_HERE] /from: XXXX-XX-XX /to: XXXX-XX-XX
```

Shortcut:
```
/e [YOUR_DESCRIPTION_HERE] /from: XXXX-XX-XX /to: XXXX-XX-XX
```

Expected outcome:
```
Got it. I have added:
[E][ ] YOUR_DESCRIPTION_HERE (from: XX XXX XXXX to: XX XXX XXXX)
```

> [!NOTE]
> Just like deadline tasks, description is optional.


### Deleting tasks
You can delete certain tasks using `delete` command.
```
delete TASK_INDEX
```

Shotcut:
```
/del TASK_INDEX
```

> [IMPORTANT!]
> Task index must be a valid index. If you wish to know the indexes of each tasks, you can use `list` command.


### Marking tasks as done
You can mark certain task as done using `done` command.
```
done TASK_INDEX
```


### Marking tasks as not done
You can mark certain task as not done using `undone` command.
```
undone TASK_INDEX
```


### Other listing tasks methods
There are various types of ways to list your tasks
1. done: List out only completed tasks
2. undone: List out tasks which are not completed
3. top done: List out completed tasks at top, and incomplete tasks at bottom
4. top undone: List out incomplete tasks at top, and completed tasks at bottom
5. alphabetically: List out your tasks in alphabetical order

**List out only completed tasks**
```
list done
```

**List out tasks which are not completed**
```
list undone
```

**List out completed tasks at top, and incomplete tasks at bottom**
```
list top done
```

**List out incomplete tasks at top, and completed tasks at bottom**
```
list top undone
```

**List out your tasks in alphabetical order**
```
list alphabetically
```

Shortcut:
```
list a
```

> [!NOTE]
> all `list` in the command can be shotcutted to `/ls`.


### Say Hi To Me <3
Say **Hi** to Hammy!

```
Hi
```

Or:
```
Hello
```


### Surprised!
Nothing much! Just some little easter eggs!
Call me maybe🤔? 😏

```
Hammy
```

## FAQ
1. Where can I check your Github page?
Q: You can click [here](https://github.com/jinhanfromNUS/ip)

2. What is the date format? Why is my date format wrong?
Q: Date format should be XXXX-XX-XX (e.g. 2023-01-01). This only applies for entering the date format.

3. Why is my date not working?
Q: The date format in your list and the date format while adding deadline/event tasks is different.
   Adding tasks: YYYY-MM-DD
   Output List: DDMMMYYYY

4. Why is my *delete* / *mark as done* / *mark as not done* not working?
Q: Please check the task index, it could likely to be invalid task index. You can enter `list` or `/ls` to check the index for each tasks.

5. Why deadline and event tasks even work without a description?
Q: That is not a bug! It is meant to be like that. Sometimes, you just need a date to remind you about your remaining tasks :).

7. Do I need to create a separate database while using this application?
Q: No! It is totally fine if there is no database upon using this application. The application will create a text file called **tasklist.txt** store all your tasks.
   **tasklist.txt** will be in the same directory as your jar file.
