# WeightedSetPackingLocal

Local Search: Attempt to replace a small subset of the solution by some collection of greater total weight that does not intersect the remainder of the solution. For such a search to be polynomially bounded, it has to be restricted in some way, such as that either the number of sets added or the number of sets removed should be constant.

Right now, the number of subsets to be replaced is defined by a constant representing the maximum number of them.

## Remaining:
- Integrate with benchmarking data source
- Generate neighbor matrix between subsets/recipes from data
- Optimize for bottlenecks if runtime is too lengthy (limit number of combinations tried, etc)
