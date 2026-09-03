package com.common.support.imagepicker.base.config;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J,\u0010\u0003\u001a\u00028\u00002\u001d\u0010\u0004\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0002\b\tH&¢\u0006\u0002\u0010\nJ,\u0010\u000b\u001a\u00028\u00002\u001d\u0010\f\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0002\b\tH&¢\u0006\u0002\u0010\nJ!\u0010\r\u001a\u00028\u00002\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u000f\"\u00020\u0007H&¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/common/support/imagepicker/base/config/Permission;", "T", "", "onAlwaysDenied", "alwaysDenied", "Lkotlin/Function1;", "", "", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "onDenied", "denied", "setPermission", "permissions", "", "([Ljava/lang/String;)Ljava/lang/Object;", "base_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface Permission<T> {
    T onAlwaysDenied(@NotNull Function1<? super List<String>, Unit> alwaysDenied);

    T onDenied(@NotNull Function1<? super List<String>, Unit> denied);

    T setPermission(@NotNull String... permissions);
}
