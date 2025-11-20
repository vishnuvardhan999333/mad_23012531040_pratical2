# Android Activity Lifecycle and Basic UI Demo

This Android application serves as a practical demonstration of the Android Activity Lifecycle and basic UI components.

## Features

*   **Displays "Hello World"**: A `TextView` in the center of the screen shows the classic "Hello World" message.
*   **Customized UI**:
    *   The activity has a yellow background (`#FFFF00`).
    *   The "Hello World" text is styled with:
        *   Holo Blue Bright color.
        *   27sp font size.
        *   Bold and Italic text style.
*   **Activity Lifecycle Demonstration**: The application actively demonstrates the various stages of the Android Activity Lifecycle.
    *   **Log Messages**: Each lifecycle method (`onCreate()`, `onStart()`, `onResume()`, `onPause()`, `onStop()`, `onRestart()`, and `onDestroy()`) prints a message to Logcat.
    *   **Toast Messages**: A short-lived Toast message is displayed for each lifecycle event.
    *   **Snackbar Messages**: A Snackbar message is shown for each lifecycle event, providing brief, dismissible feedback.

## Concepts Covered

*   **`TextView` and its properties**: `android:textColor`, `android:textSize`, `android:textStyle`.
*   **`ConstraintLayout`**: Centering a view within the layout.
*   **Android In-built Resources**: Using pre-defined colors like `@android:color/holo_blue_bright`.
*   **Activity Lifecycle**: Understanding and implementing the core lifecycle methods.
*   **Logging**: Using the `Log` class to output messages to Logcat.
*   **`Toast` Message**: Displaying simple, transient pop-up notifications.
*   **`Snackbar` Message**: Showing lightweight feedback messages.
