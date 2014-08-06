# Written by Mathieu Liénard--Mayor, UFRGS, 2014-2 */

SRC_DIR = ./src
BIN_DIR = ./bin
BIN_FILES = $(BIN_DIR)/Key.class\
			$(BIN_DIR)/Data.class\
			$(BIN_DIR)/KeyData.class $(BIN_DIR)/PriorityQueue.class\
			$(BIN_DIR)/SortedList.class\
			$(BIN_DIR)/Array.class $(BIN_DIR)/Heap.class\
			$(BIN_DIR)/Node.class $(BIN_DIR)/Dijkstra.class

JMFLAGS = -cp $(BIN_DIR)
JM = java $(JMFLAGS)
JCCFLAGS = -d $(BIN_DIR) $(JMFLAGS) -sourcepath $(SRC_DIR)
JCC = javac $(JCCFLAGS)

compile: $(BIN_FILES)

TestKey: $(BIN_DIR)/TestKey.class $(BIN_DIR)/Key.class
	$(JM) $@

$(BIN_DIR)/%.class: $(SRC_DIR)/%.java
	$(JCC) $^

clean:
	rm -f $(BIN_DIR)/*.class **~ .**.swp
