/* 
 -----------------------------------------------------------------------------
                   Cogaen - Component-based Game Engine (v3)
 -----------------------------------------------------------------------------
 This software is developed by the Cogaen Development Team. Please have a 
 look at our project home page for further details: http://www.cogaen.org
    
 - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
 Copyright (c) Roman Divotkey, 2010-2011

 Permission is hereby granted, free of charge, to any person obtaining a copy
 of this software and associated documentation files (the "Software"), to deal
 in the Software without restriction, including without limitation the rights
 to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 copies of the Software, and to permit persons to whom the Software is
 furnished to do so, subject to the following conditions:

 The above copyright notice and this permission notice shall be included in
 all copies or substantial portions of the Software.

 THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 THE SOFTWARE.
 - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
*/
package spaceAI.event;

/**
 *
 * This SimpleEvent Class is based on cogaen3 by Roman Divotkey
 * @link http://www.cogaen.org
 * @link http://code.google.com/p/cogaen3-java/
 * 
 * @author Roman Divotkey
 * @author PeterTheOne
 */
public abstract class Event {

    /**
     * Returns the type of this event.
     * 
     * @return <code>EventType</code> of this event.
     */
    public abstract EventType getType();

    /** 
     * Tests if this event is of given event type.
     * 
     * @param type {@code EventType} to be tested.
     * @return {@code true} if this event is of given type, {@code false} otherwise.
     */
    public boolean isOfType(EventType type) {
        return getType().equals(type);
    }
}
