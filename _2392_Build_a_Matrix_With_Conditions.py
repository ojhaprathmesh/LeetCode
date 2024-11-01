from collections import deque, defaultdict
from typing import List


class Solution:
    @staticmethod
    def buildMatrix(k: int, rowConditions: list[list[int]], colConditions: list[list[int]]) -> List[List[int]]:
        def topological_sort(conditions: list[list[int]]) -> list[int]:
            graph = defaultdict(list)
            in_degree = [0] * (k + 1)

            for u, v in conditions:
                graph[u].append(v)
                in_degree[v] += 1

            queue = deque([i for i in range(1, k + 1) if in_degree[i] == 0])
            order = []

            while queue:
                node = queue.popleft()
                order.append(node)
                for neighbor in graph[node]:
                    in_degree[neighbor] -= 1
                    if in_degree[neighbor] == 0:
                        queue.append(neighbor)

            return order if len(order) == k else []

        row_order = topological_sort(rowConditions)
        col_order = topological_sort(colConditions)

        if not row_order or not col_order:
            return []

        row_position = {num: i for i, num in enumerate(row_order)}
        col_position = {num: i for i, num in enumerate(col_order)}

        matrix = [[0] * k for _ in range(k)]
        for num in range(1, k + 1):
            matrix[row_position[num]][col_position[num]] = num

        return matrix


obj = Solution()

result = obj.buildMatrix(3, [[1, 2], [3, 2]], [[2, 1], [3, 2]])
print(result)
