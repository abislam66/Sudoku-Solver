# Sudoku Solver Engine

## Overview
A Java-based Sudoku solver engine that uses **recursive backtracking** to solve
9×9 Sudoku puzzles while enforcing all standard constraints.

The solver fills the board **one cell at a time**, backtracking whenever a choice
leads to an invalid configuration, until a complete solution is found.

## How It Works
- Finds the next empty cell
- Tries numbers **1–9**
- Checks validity across:
  - rows
  - columns
  - 3×3 subgrids
- Uses recursion to explore valid states
- Backtracks when no valid number fits

## Features
- Solves partially filled Sudoku puzzles
- Uses constraint validation for correctness
- Efficient backtracking algorithm
- Clean console output of solved board

## Implementation Details
- Board represented as a 2D integer array
- Empty cells represented by `0`
- Recursive depth-first search with backtracking
- Stops when a valid complete solution is found

## How to Run
1. Define the Sudoku puzzle in the code using a 2D array
2. Compile the Java files
3. Run the main class
4. View the solved Sudoku board in the console

## Tech Stack
- Java
- Recursion
- Backtracking
- Constraint Satisfaction

## License
MIT

