/* Written by Mathieu Liénard--Mayor, UFRGS, 2014-2 */

/** Package describing the representation of graphs
 ** and providing the creation of a graph from a DIMACS format file
*/
#include <iostream>
using namespace std;

struct MyVertex {
};

struct MyEdge {
};

struct MyGraph {
};

/** Reads the content of a DIMACS file, then creates and allocates a MyGraph
 ** file: file descriptor of the DIMACS file to read
 ** n:
 ** m:
 ** graph: the completed graph
*/
void create_graph(std::istream& file, unsigned& n, unsigned& m, MyGraph& graph);

/* Written by Mathieu Liénard--Mayor, UFRGS, 2014-2 */
