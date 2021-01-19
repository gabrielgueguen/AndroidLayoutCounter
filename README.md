# Android Layout Counter
A simple Android app to practice portrait and landscape layouts with simple button actions to count up and down.

## Specifications

### App Includes:
* Must use constraint layout;
* Must use data binding;
* Must save and restore state on configuration change(override onSaveInstanceState() and onRestoreInstanceState());
  * The count will persist through configuration change (rotating the phone between portrait and landscape mode).
* Must use colours that respect the phones dark and light themes (need an AVD at API 29 or higher for dark and light modes);
* App will have three buttons:
  * "TOAST",  will display a Toast that includes the current count when clicked;
  * "Count Up" will increment the count when clicked;
  * "Count Down" will decrement the count when clicked;
  * The layout will have a different arrangements when the phone is in Portrait mode than in Landscape mode.
