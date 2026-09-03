package io.opentelemetry.api.common;

import android.os.Build;
import io.opentelemetry.api.internal.ImmutableKeyValuePairs;
import java.util.Comparator;
import javax.annotation.concurrent.Immutable;

/* JADX INFO: loaded from: classes5.dex */
@Immutable
final class ArrayBackedAttributes extends ImmutableKeyValuePairs<AttributeKey<?>, Object> implements Attributes {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final Attributes f32493OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final Comparator<AttributeKey<?>> f32494OooO0o0;

    static {
        f32494OooO0o0 = Build.VERSION.SDK_INT >= 24 ? Comparator.comparing(new OooO0O0()) : new OooO0OO();
        f32493OooO0o = new ArrayBackedAttributesBuilder().build();
    }
}
