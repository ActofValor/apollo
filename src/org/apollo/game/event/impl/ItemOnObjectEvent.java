package org.apollo.game.event.impl;

import org.apollo.game.event.Event;

/**
 * An {@link Event} sent by the client when an item is used on an object.
 * 
 * @author Major
 */
public final class ItemOnObjectEvent extends InventoryItemEvent {

	/**
	 * The object id the item was used on.
	 */
	private final int objectId;

	/**
	 * The x coordinate of the object.
	 */
	private final int x;

	/**
	 * The y coordinate of the object.
	 */
	private final int y;

	/**
	 * Creates an item on object event.
	 * 
	 * @param interfaceId The interface id.
	 * @param id The item id.
	 * @param slot The slot the item is in.
	 * @param objectId The object id.
	 * @param x The x coordinate.
	 * @param y The y coordinate.
	 */
	public ItemOnObjectEvent(int interfaceId, int id, int slot, int objectId, int x, int y) {
		super(0, interfaceId, id, slot);
		this.objectId = objectId;
		this.x = x;
		this.y = y;
	}

	/**
	 * Gets the object id.
	 * 
	 * @return The object id.
	 */
	public int getObjectId() {
		return objectId;
	}

	/**
	 * Gets the x coordinate of the object.
	 * 
	 * @return The x coordinate.
	 */
	public int getX() {
		return x;
	}

	/**
	 * Gets the y coordinate of the object.
	 * 
	 * @return The y coordinate.
	 */
	public int getY() {
		return y;
	}

}