package com.tmtron.jackimmutables;

import org.immutables.value.Value;

@Value.Immutable
interface SimpleData {
    String data();
}
