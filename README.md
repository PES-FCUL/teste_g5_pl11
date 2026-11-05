# Assignment branch `fc51098`

This branch is yours alone. It contains a small Java 17 / Maven project.

## The bugs

All the bugs are in **`src/main/java/pt/ul/fc/Basics383.java`**. It has 10 static methods, each documented
with Javadoc. **Exactly two of them do not do what their Javadoc says**:

1. `int Basics383.scale(int amount)`: Javadoc says "Returns amount multiplied by 5." but the code returns `amount + 5` 
2. `String Basics383.capitalizeAll(String s)`: Javadoc says "Returns s converted to upper case." but the code returns `s.toLowerCase()` 

The rest are correct.

A few tests for correct methods already exist in `src/test/java/pt/ul/fc/Basics383Test.java`
(3 tests, all passing): use them as a model.

## What to do

1. **Expose the bugs.** Write **JUnit 5 tests** (in `src/test/java/pt/ul/fc/`)
   that expose each one. Run them with `mvn test`; they must **fail** on the buggy code.
   Commit the tests (without touching `src/main`).
2. **Fix the bugs** in `src/main/java/pt/ul/fc/Basics383.java` so the Javadoc is respected. All tests must now pass.
   Commit the fixes (without touching `src/test`). Do not change correct methods.
3. **Push** your branch: `git push origin fc51098`.
4. Open a PR to the original repo.

Use meaningful commit messages. Do not rename the class or change method signatures.

If you need to undo the last commit, you can do so with `git reset --soft HEAD~1`.
