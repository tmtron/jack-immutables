package com.tmtron.jackimmutables;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link SimpleData}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSimpleData.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "SimpleData"})
final class ImmutableSimpleData implements SimpleData {
    private final String data;

    private ImmutableSimpleData(String data) {
        this.data = data;
    }

    /**
     * @return The value of the {@code data} attribute
     */
    @Override
    public String data() {
        return data;
    }

    /**
     * Copy the current immutable object by setting a value for the {@link SimpleData#data() data} attribute.
     * An equals check used to prevent copying of the same value by returning {@code this}.
     * @param value A new value for data
     * @return A modified copy of the {@code this} object
     */
    public final ImmutableSimpleData withData(String value) {
        if (this.data.equals(value)) return this;
        String newValue = ImmutableSimpleData.requireNonNull(value, "data");
        return new ImmutableSimpleData(newValue);
    }

    /**
     * This instance is equal to all instances of {@code ImmutableSimpleData} that have equal attribute values.
     * @return {@code true} if {@code this} is equal to {@code another} instance
     */
    @Override
    public boolean equals(Object another) {
        if (this == another) return true;
        return another instanceof ImmutableSimpleData
                && equalTo((ImmutableSimpleData) another);
    }

    private boolean equalTo(ImmutableSimpleData another) {
        return data.equals(another.data);
    }

    /**
     * Computes a hash code from attributes: {@code data}.
     * @return hashCode value
     */
    @Override
    public int hashCode() {
        int h = 31;
        h = h * 17 + data.hashCode();
        return h;
    }

    /**
     * Prints the immutable value {@code SimpleData} with attribute values.
     * @return A string representation of the value
     */
    @Override
    public String toString() {
        return "SimpleData{"
                + "data=" + data
                + "}";
    }

    /**
     * Creates an immutable copy of a {@link SimpleData} value.
     * Uses accessors to get values to initialize the new immutable instance.
     * If an instance is already immutable, it is returned as is.
     * @param instance The instance to copy
     * @return A copied immutable SimpleData instance
     */
    public static ImmutableSimpleData copyOf(SimpleData instance) {
        if (instance instanceof ImmutableSimpleData) {
            return (ImmutableSimpleData) instance;
        }
        return ImmutableSimpleData.builder()
                .from(instance)
                .build();
    }

    /**
     * Creates a builder for {@link ImmutableSimpleData ImmutableSimpleData}.
     * @return A new ImmutableSimpleData builder
     */
    public static ImmutableSimpleData.Builder builder() {
        return new ImmutableSimpleData.Builder();
    }

    /**
     * Builds instances of type {@link ImmutableSimpleData ImmutableSimpleData}.
     * Initialize attributes and then invoke the {@link #build()} method to create an
     * immutable instance.
     * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
     * but instead used immediately to create instances.</em>
     */
    static final class Builder {
        private static final long INIT_BIT_DATA = 0x1L;
        private long initBits = 0x1L;

        private String data;

        private Builder() {
        }

        /**
         * Fill a builder with attribute values from the provided {@code SimpleData} instance.
         * Regular attribute values will be replaced with those from the given instance.
         * Absent optional values will not replace present values.
         * @param instance The instance from which to copy values
         * @return {@code this} builder for use in a chained invocation
         */
        public final Builder from(SimpleData instance) {
            ImmutableSimpleData.requireNonNull(instance, "instance");
            data(instance.data());
            return this;
        }

        /**
         * Initializes the value for the {@link SimpleData#data() data} attribute.
         * @param data The value for data
         * @return {@code this} builder for use in a chained invocation
         */
        public final Builder data(String data) {
            this.data = ImmutableSimpleData.requireNonNull(data, "data");
            initBits &= ~INIT_BIT_DATA;
            return this;
        }

        /**
         * Builds a new {@link ImmutableSimpleData ImmutableSimpleData}.
         * @return An immutable instance of SimpleData
         * @throws java.lang.IllegalStateException if any required attributes are missing
         */
        public ImmutableSimpleData build() {
            if (initBits != 0) {
                throw new IllegalStateException(formatRequiredAttributesMessage());
            }
            return new ImmutableSimpleData(data);
        }

        private String formatRequiredAttributesMessage() {
            List<String> attributes = new ArrayList<String>();
            if ((initBits & INIT_BIT_DATA) != 0) attributes.add("data");
            return "Cannot build SimpleData, some of required attributes are not set " + attributes;
        }
    }

    private static <T> T requireNonNull(T object, String message) {
        if (object == null) throw new NullPointerException(message);
        return object;
    }
}
