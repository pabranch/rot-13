# rot-13

### Overview
You will be implementing a version of ROT13 https://en.wikipedia.org/wiki/ROT13.

This version will allow a dynamic rotation. 13 is the default value, but the caller can use any integer > 0 for n.

### CLI
This program will be called from the CLI like this:

### Input
- `node index.js "hello"`

### Output
- `input: hello, output: uryyb`

### Other
- The default rotation is 13, but you can pass in a different rotation via an environmental variable.
- If you don't send in a rotation the default is 13, if you don't send a string to encode the default is "hello world"
- Test your code using Mocha
- Organize your code as appropriate
