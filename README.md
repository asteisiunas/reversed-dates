# reversed-dates
Bonus task implementation

In this code, we use SimpleDateFormat to attempt to parse the date string formed by concatenating the original year and reversed year. If the parsing is successful, and the parsed date string matches the original date string, it means we have a valid date, and we print it.

This approach avoids iteration over 364 days for each year and the need to validate month and day separately, as it relies on Java's date parsing mechanism to handle these aspects.
