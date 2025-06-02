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

//| Feature          | `RequestSpecification`                            | `ResponseSpecification`                           |
//| ---------------- | ------------------------------------------------- | ------------------------------------------------- |
//| **Purpose**      | Defines the **structure of the request**          | Defines the **expectations on the response**      |
//| **Use Case**     | Reusable settings for all outgoing API requests   | Reusable assertions/checks for received responses |
//| **Typical Use**  | Base URI, headers, auth, query params, body, etc. | Expected status code, content type, response time |
//| **Belongs to**   | `given()` part of the request                     | `then()` part of the response                     |
//| **Created With** | `RequestSpecBuilder`                              | `ResponseSpecBuilder`                             |

//500 Internal Server Error	503 Service Unavailable
//| Code    | Meaning    | When to Use / Expect It                            |
//| ------- | ---------- | -------------------------------------------------- |
//| **200** | OK         | Standard success (GET/PUT/DELETE)                  |
//| **201** | Created    | When a resource is successfully created (POST)     |
//| **202** | Accepted   | Request accepted for processing (e.g. async tasks) |
//| **204** | No Content | Successful, but no body in response (DELETE, PUT)  |

//| Code    | Meaning              | When to Use / Expect It                               |
//| ------- | -------------------- | ----------------------------------------------------- |
//| **400** | Bad Request          | Malformed syntax, missing fields                      |
//| **401** | Unauthorized         | Missing/invalid authentication (token, header)        |
//| **403** | Forbidden            | Authenticated but no permission                       |
//| **404** | Not Found            | Endpoint/resource doesn't exist                       |
//| **405** | Method Not Allowed   | Wrong HTTP method (e.g., POST on a GET-only endpoint) |
//| **409** | Conflict             | Duplicate resource, version mismatch, etc.            |
//| **422** | Unprocessable Entity | Valid JSON, but semantic issue (invalid data format)  |
//

//| Code    | Meaning               | When to Use / Expect It                          |
//| ------- | --------------------- | ------------------------------------------------ |
//| **500** | Internal Server Error | Unhandled exception on backend                   |
//| **502** | Bad Gateway           | Gateway/proxy got invalid response from upstream |
//| **503** | Service Unavailable   | Server temporarily down or overloaded            |
//| **504** | Gateway Timeout       | Upstream server didn’t respond in time           |


