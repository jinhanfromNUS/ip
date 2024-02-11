package duke.response;//package duke;

import duke.task.Task;

import java.util.ArrayList;

/**
 * The Ui class manages user interface interactions and displays messages to the user.
 */
public class Ui {
    /** The name of the bot. */
    String botName;

    /**
     * Constructs a Ui object with the specified bot name.
     *
     * @param botName the name of the bot
     */
    public Ui(String botName) {
        this.botName = botName;
    }

    /**
     * Sends a welcome message to the user.
     * Can alter welcomeStr
     */
    public String sendWelcome() {
        String welcomeStr = " Hello! I'm " + botName + "\n What can I do for you?";
        return welcomeStr;
    }

    /**
     * Sends a goodbye message to the user.
     * Can alter byeStr
     */
    public String sendGoodbye() {
        String byeStr = "Bye. Hope to see you again soon!";
        return byeStr;
    }

    /**
     * Sends this when user input is not unrecognized.
     */
    public String badUserInput() {
        return botName + " does not understand you :((";
    }

    /**
     * Sends the list of current tasks
     * Also sends the amount of tasks
     *
     * @param taskList the task lists
     */
    public String showTaskList(ArrayList<Task> taskList) {
        if (taskList.isEmpty()) {
            return "There are no tasks!";
        } else {
            String tasksString = "Here are the tasks in your list:";
            for (int i = 0; i < taskList.size(); i++) {
                Task task = taskList.get(i);
                tasksString = tasksString + "\n" + (i + 1) + ". " + task;
            }
            return tasksString;
        }
    }

    public String addNewTask(Task addedTask, int taskListSize) {
        return "Got it. I have added:\n"
                + " " + addedTask + "\n"
                + "There are " + taskListSize + " tasks in the task list currently.";
    }

    public String deleteTask(Task deletedTask, int taskListSize) {
        return "Task has been successfully removed:\n"
                + " " + deletedTask + "\n"
                + "There are " + taskListSize + " tasks in the task list currently.";
    }

    public String invalidTaskIndex() {
        return "Invalid Task Index!";
    }

    public String markAsDone(Task doneTask) {
        return "Nice! I've marked this task as done:\n"
                + "  " + doneTask;
    }

    public String markAsUndone(Task undoneTask) {
        return "OK, I've marked this task as not done:\n"
                + "  " + undoneTask;
    }

    /**
     * Sends when user enter invalid index
     */
    public String noIndexDeleteTask() {
        return "Please provide the task index you want to delete.";
    }

    /**
     * Sends when user enter invalid index
     */
    public String noIndexMarkAsDone() {
        return "Please provide the task index to mark as done.";
    }

    /**
     * Sends when user enter invalid index
     */
    public String noIndexMarkAsUndone() {
        return "Please provide the task index to mark as not done.";
    }

    /**
     * Sends when user enter invalid date format
     */
    public String invalidDateInput() {
        return "Error input: Date format is invalid (Date format: YYYY-MM-DD)";
    }

    public String insufficientTodoDescription() {
        return "Please provide a description for your Todo task.";
    }

    public String insufficientDeadline() {
        return "Please provide a deadline for your Deadline task.";
    }

    public String insufficientEventStartTimeEndTime() {
         return "Please provide both starting time and ending time for your event task.";
    }

    public String insufficientEventStartTime() {
        return "Please provide a starting time for your event task.";
    }

    public String insufficientEventEndTime() {
        return "Please provide a ending time for your event task.";
    }

    public String invalidEventStartingTimeAndEndingTime() {
        return "Error input: Start time should be earlier than end time.";
    }

    public String noMatchingTasks(String keyword) {
        return "There are no tasks matching with '" + keyword + "'.";
    }

    /**
     * Sends when user forgot to enter a keyword when using searching feature.
     */
    public String noKeywordsForSearching() {
        return "Please provide a keyword to search.";
    }
}