package com.common.support.permission;

import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010BH\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u00060\u0003\u0012)\u0010\u0007\u001a%\u0012\u001f\u0012\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0004\u0012\u00020\u00050\bj\u0002`\u000b¢\u0006\u0002\b\f\u0018\u00010\u0003¢\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\u0005H\u0016J\b\u0010\u000f\u001a\u00020\u0005H\u0016R1\u0010\u0007\u001a%\u0012\u001f\u0012\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0004\u0012\u00020\u00050\bj\u0002`\u000b¢\u0006\u0002\b\f\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0002\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u00060\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/common/support/permission/KtxPermissionRequest;", "Lcom/common/support/permission/PermissionRequest;", "requestPermission", "Ljava/lang/ref/WeakReference;", "Lkotlin/Function0;", "", "Lcom/common/support/permission/Func;", "permissionDenied", "Lkotlin/Function1;", "", "", "Lcom/common/support/permission/Func1;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/ref/WeakReference;Ljava/lang/ref/WeakReference;)V", "cancel", "proceed", "Companion", "lib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class KtxPermissionRequest implements PermissionRequest {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final WeakReference<Function1<List<String>, Unit>> permissionDenied;

    @NotNull
    private final WeakReference<Function0<Unit>> requestPermission;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J?\u0010\u0003\u001a\u00020\u00042%\u0010\u0005\u001a!\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006j\u0004\u0018\u0001`\n¢\u0006\u0002\b\u000b2\u0010\u0010\f\u001a\f\u0012\u0004\u0012\u00020\t0\rj\u0002`\u000e¨\u0006\u000f"}, d2 = {"Lcom/common/support/permission/KtxPermissionRequest$Companion;", "", "()V", "create", "Lcom/common/support/permission/KtxPermissionRequest;", "onPermissionDenied", "Lkotlin/Function1;", "", "", "", "Lcom/common/support/permission/Func1;", "Lkotlin/ExtensionFunctionType;", "requestPermission", "Lkotlin/Function0;", "Lcom/common/support/permission/Func;", "lib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nKtxPermissionRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KtxPermissionRequest.kt\ncom/common/support/permission/KtxPermissionRequest$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,25:1\n1#2:26\n*E\n"})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KtxPermissionRequest create(@Nullable Function1<? super List<String>, Unit> onPermissionDenied, @NotNull Function0<Unit> requestPermission) {
            Intrinsics.checkNotNullParameter(requestPermission, "requestPermission");
            return new KtxPermissionRequest(new WeakReference(requestPermission), onPermissionDenied != null ? new WeakReference(onPermissionDenied) : null);
        }
    }

    public KtxPermissionRequest(@NotNull WeakReference<Function0<Unit>> requestPermission, @Nullable WeakReference<Function1<List<String>, Unit>> weakReference) {
        Intrinsics.checkNotNullParameter(requestPermission, "requestPermission");
        this.requestPermission = requestPermission;
        this.permissionDenied = weakReference;
    }

    @Override // com.common.support.permission.PermissionRequest
    public void cancel() {
        Function1<List<String>, Unit> function1;
        WeakReference<Function1<List<String>, Unit>> weakReference = this.permissionDenied;
        if (weakReference == null || (function1 = weakReference.get()) == null) {
            return;
        }
        List<String> EMPTY_LIST = PermissionUtils.EMPTY_LIST;
        Intrinsics.checkNotNullExpressionValue(EMPTY_LIST, "EMPTY_LIST");
        function1.invoke(EMPTY_LIST);
    }

    @Override // com.common.support.permission.PermissionRequest
    public void proceed() {
        Function0<Unit> function0 = this.requestPermission.get();
        if (function0 != null) {
            function0.invoke();
        }
    }
}
