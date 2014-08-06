# Written by Mathieu Liénard--Mayor, UFRGS, 2014-2 */

INC_DIR = ./inc
INC_FILES = $(INC_DIR)/graph.hpp
SRC_DIR = ./src
SRC_FILES = $(SRC_DIR)/graph.cpp $(SRC_DIR)/dijkstra.cpp
BIN_DIR = ./bin
BIN_FILES = $(BIN_DIR)/graph.o $(BIN_DIR)/dijkstra.o
EXE_FILES = ./dijkstra

CCFLAGS =
CC = g++

run: dijkstra
	./dijkstra 1 2

dijkstra: $(BIN_DIR)/dijkstra.o $(BIN_DIR)/graph.o
	$(CC) $^ -o $@

$(BIN_DIR)/dijkstra.o: $(SRC_DIR)/dijkstra.cpp $(INC_DIR)/graph.hpp
	$(CC) -c $< -o $@

$(BIN_DIR)/graph.o: $(SRC_DIR)/graph.cpp $(INC_DIR)/graph.hpp
	$(CC) -c $< -o $@

clean:
	rm -f $(BIN_FILES) **~ .**.swp
