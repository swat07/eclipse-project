//package APICode;
//
//public class Theory {
//
//}
//| Feature              | **HashMap**     | **LinkedHashMap**   | **TreeMap**     | **HashSet**       | **ArrayList**     | **LinkedList**         | **Queue** (LinkedList) |
//| -------------------- | --------------- | ------------------- | --------------- | ----------------- | ----------------- | ---------------------- | ---------------------- |
//| **Type**             | Map (Key-Value) | Map (Key-Value)     | Map (Key-Value) | Set (Values only) | List (Indexed)    | List (Indexed)         | FIFO (Queue)           |
//| **Order Maintained** | ❌ No            | ✅ Insertion Order   | ✅ Sorted by key | ❌ No              | ✅ Insertion Order | ✅ Insertion Order      | ✅ FIFO Order           |
//| **Duplicates**       | ❌ Keys only     | ❌ Keys only         | ❌ Keys only     | ❌ Not allowed     | ✅ Allowed         | ✅ Allowed              | ✅ Allowed              |
//| **Null Allowed**     | ✅ 1 key, values | ✅ 1 key, values     | ❌ No null keys  | ✅ 1 null value    | ✅ Allowed         | ✅ Allowed              | ✅ Allowed              |
//| **Access Speed**     | ✅ O(1) avg      | ✅ O(1) avg          | ❌ O(log n)      | ✅ O(1) avg        | ✅ get(index) O(1) | ❌ get(index) O(n)      | ❌ poll/peek O(1)       |
//| **Insert/Delete**    | ✅ O(1) avg      | ✅ O(1) avg          | ❌ O(log n)      | ✅ O(1) avg        | ❌ O(n) mid        | ✅ O(1) at head/tail    | ✅ O(1) (FIFO)          |
//| **Thread-Safe**      | ❌ No            | ❌ No                | ❌ No            | ❌ No              | ❌ No              | ❌ No                   | ❌ No                   |
//| **Use Case**         | Fast lookup     | Fast lookup + order | Sorted maps     | Unique elements   | Indexed access    | Frequent insert/delete | First-in-first-out     |
