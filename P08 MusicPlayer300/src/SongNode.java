//////////////// SongNode Class //////////////////////////
//
// Title: P08 MusicPlayer300
// Course: CS 300 Fall 2022
//
// Author: Ria Sharma
// Email: rsharma78@wisc.edu
// Lecturer: Hobbes LeGault
//
//////////////////// PAIR PROGRAMMERS COMPLETE THIS SECTION ///////////////////
//
// Partner Name: Alexander Kalis
// Partner Email: akalis@wisc.edu
// Partner Lecturer's Name: Mouna Kacem
//
// VERIFY THE FOLLOWING BY PLACING AN X NEXT TO EACH TRUE STATEMENT:
// _X_ Write-up states that pair programming is allowed for this assignment.
// _X_ We have both read and understand the course Pair Programming Policy.
// _X_ We have registered our team prior to the team registration deadline.
//
///////////////////////// ALWAYS CREDIT OUTSIDE HELP //////////////////////////
//
// Persons:
// Online Sources: ZyBooks
//
///////////////////////////////////////////////////////////////////////////////
/**
 * A singly-linked node for our linked queue, which contains a Song object
 */
public class SongNode {
  private SongNode next; // The next SongNode in this queue
  private Song song; // The Song object in this node

  /**
   * Constructs a single SongNode containing the given data, not linked to any other SongNodes
   * 
   * @param data - the Song for this node
   * @throws IllegalArgumentException - if data is null
   */
  public SongNode(Song data) throws IllegalArgumentException {
    if (data == null) {
      throw new IllegalArgumentException("data is null");
    }
    this.song = data;
  }

  /**
   * Constructs a single SongNode containing the given data, linked to the specified SongNode
   * 
   * @param data - the Song for this node
   * @param next - the next node in the queue
   * @throws IllegalArgumentException - if data is null
   */
  public SongNode(Song data, SongNode next) throws IllegalArgumentException {
    if (data == null) {
      throw new IllegalArgumentException("data is null");
    }
    this.song = data;
    this.next = next;
  }

  /**
   * Accessor method for this node's data
   * 
   * @return the Song in this node
   */
  public Song getSong() {
    return this.song;
  }

  /**
   * Accessor method for the next node in the queue
   * 
   * @return the SongNode following this one, if any
   */
  public SongNode getNext() {
    return this.next;
  }

  /**
   * Changes the value of this SongNode's next data field to the given value
   * 
   * @param next - the SongNode to follow this one; may be null
   */
  public void setNext(SongNode next) {
    this.next = next;
  }
}
