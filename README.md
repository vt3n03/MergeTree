# MergeTree

This project contains a set of Java classes that implement several core binary tree structures and operations. It includes a basic binary search tree, an AVL tree with self balancing, rotation logic, node structures, and a tree merge algorithm. A simple Main file is provided to run and test the implemented features.

# Features
Binary Search Tree

The BST class supports standard operations such as inserting nodes, searching for values, and performing tree traversals. It builds a sorted structure where each left child is less than the parent and each right child is greater.

AVL Tree

The AVL tree extends the idea of a BST by keeping itself height balanced. It tracks balance factors, performs rotations when imbalance is detected, and ensures that the tree remains efficient for insert and lookup operations.

Tree Rotations

The Rotation class contains the logic for left and right rotations. These operations correct imbalance in the AVL tree by shifting the structure of the tree while preserving the order of nodes.

Tree Merging

The merge class provides a method that takes two binary trees and combines them into a single tree. Nodes that overlap can be added together or handled according to the chosen merge logic.

Tree Node Structure

Each tree uses a shared node structure that stores a value and references to left and right children. This supports reuse across the different tree types.

Main Program

The main file gives simple examples of creating trees and calling the supported operations. It can be used as a starting point for testing and expanding the project.
