/**    / \____  _    ______   _____ / \____   ____  _____
 *    /  \__  \/ \  / \__  \ /  __//  \__  \ /    \/ __  \   Javaslang
 *  _/  // _\  \  \/  / _\  \\_  \/  // _\  \  /\  \__/  /   Copyright 2014-2015 Daniel Dietrich
 * /___/ \_____/\____/\_____/____/\___\_____/_/  \_/____/    Licensed under the Apache License, Version 2.0
 */
package javax.util.function;

/*-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-*\
   G E N E R A T O R   C R A F T E D
\*-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-*/

import java.io.Serializable;
import java.util.Objects;

@FunctionalInterface
public interface CheckedDoubleLongConsumer extends Serializable {

    static final long serialVersionUID = 1L;

    void accept(double left, long right) throws Throwable;

    default CheckedDoubleLongConsumer andThen(CheckedDoubleLongConsumer after) {
        Objects.requireNonNull(after);
        return (double left, long right) -> { accept(left, right); after.accept(left, right); };
    }

}