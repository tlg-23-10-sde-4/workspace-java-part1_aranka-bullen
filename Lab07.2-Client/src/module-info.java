/*
 *The packages in this module are:
 * com.entertainment.client
 */

module com.entertainment.client {
    //This module is the client, so it does not export anything.
    // However, it does need to list its dependency.
    // Which of my *packages* are "exposed" to other Java modules?
    // In here, I have access to the public classes in this module's exposed packages.

    requires com.entertainment;
}