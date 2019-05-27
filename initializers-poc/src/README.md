TL;DR:
The order is as follows:
1. For every parent from the top-level down:
1a. Static variables are set. At this point, non-static variables are not even available. (Variables assigned via a method and constants are treated exactly the same, in every case).
1b. All its static initializers are called, in their declaration order.
2. Code starts executing.
3. For every parent from the top-level down:
3a. Non-static variables are set.
3b. All its non-static initializers are invoked, in their declaration order.
3c. Constructors are invoked.
