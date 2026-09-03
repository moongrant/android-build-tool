package com.yalla.yalla.model;

import androidx.annotation.NonNull;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p522o0o0O0o.oOO00O;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0005J\u000e\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0005J:\u0010\u0013\u001a\u00020\u000f2\b\b\u0001\u0010\u0014\u001a\u00020\u00152(\b\u0002\u0010\u0016\u001a\"\u0012\u0004\u0012\u00020\u0000\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0017J \u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00062\b\b\u0002\u0010\u001a\u001a\u00020\u0006R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000RA\u0010\u0007\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006 \t*\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00040\u00040\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/yalla/yalla/model/DialogLinkItem;", "", "()V", "dialogLinkFromMap", "", "Lcom/yalla/yalla/model/DialogLinkFrom;", "", "dialogLinkLiveData", "Landroidx/lifecycle/MutableLiveData;", "kotlin.jvm.PlatformType", "getDialogLinkLiveData", "()Landroidx/lifecycle/MutableLiveData;", "dialogLinkLiveData$delegate", "Lkotlin/Lazy;", "clear", "", "contains", "from", "containsAndValue", "observe", "owner", "Landroidx/lifecycle/LifecycleOwner;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function2;", "postPut", AppMeasurementSdk.ConditionalUserProperty.VALUE, "needIsContains", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class DialogLinkItem {
    public static final int $stable = 8;

    @NotNull
    private final Map<DialogLinkFrom, Boolean> dialogLinkFromMap;

    /* JADX INFO: renamed from: dialogLinkLiveData$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy dialogLinkLiveData;

    public DialogLinkItem() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(DialogLinkFrom.Default, Boolean.FALSE);
        this.dialogLinkFromMap = linkedHashMap;
        this.dialogLinkLiveData = LazyKt.lazy(new Function0<MutableLiveData<Map<DialogLinkFrom, Boolean>>>() { // from class: com.yalla.yalla.model.DialogLinkItem$dialogLinkLiveData$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final MutableLiveData<Map<DialogLinkFrom, Boolean>> invoke() {
                return new MutableLiveData<>(this.this$0.dialogLinkFromMap);
            }
        });
    }

    private final MutableLiveData<Map<DialogLinkFrom, Boolean>> getDialogLinkLiveData() {
        return (MutableLiveData) this.dialogLinkLiveData.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void observe$default(DialogLinkItem dialogLinkItem, LifecycleOwner lifecycleOwner, Function2 function2, int i, Object obj) {
        if ((i & 2) != 0) {
            function2 = null;
        }
        dialogLinkItem.observe(lifecycleOwner, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: observe$lambda-1, reason: not valid java name */
    public static final void m305observe$lambda1(Function2 function2, DialogLinkItem this$0, Map it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (function2 != null) {
            Intrinsics.checkNotNullExpressionValue(it, "it");
            function2.invoke(this$0, it);
        }
    }

    public static /* synthetic */ void postPut$default(DialogLinkItem dialogLinkItem, DialogLinkFrom dialogLinkFrom, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z2 = false;
        }
        dialogLinkItem.postPut(dialogLinkFrom, z, z2);
    }

    public final void clear() {
        this.dialogLinkFromMap.clear();
        Map<DialogLinkFrom, Boolean> value = getDialogLinkLiveData().getValue();
        if (value != null) {
            value.clear();
        }
    }

    public final boolean contains(@NotNull DialogLinkFrom from) {
        Intrinsics.checkNotNullParameter(from, "from");
        return this.dialogLinkFromMap.containsKey(from);
    }

    public final boolean containsAndValue(@NotNull DialogLinkFrom from) {
        Intrinsics.checkNotNullParameter(from, "from");
        return this.dialogLinkFromMap.containsKey(from) && oOO00O.OooO0OO(this.dialogLinkFromMap.get(from));
    }

    public final void observe(@NonNull @NotNull LifecycleOwner owner, @Nullable final Function2<? super DialogLinkItem, ? super Map<DialogLinkFrom, Boolean>, Unit> listener) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        getDialogLinkLiveData().observe(owner, new Observer() { // from class: com.yalla.yalla.model.OooO00o
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                DialogLinkItem.m305observe$lambda1(listener, this, (Map) obj);
            }
        });
    }

    public final void postPut(@NotNull DialogLinkFrom from, boolean value, boolean needIsContains) {
        Intrinsics.checkNotNullParameter(from, "from");
        if (!needIsContains) {
            this.dialogLinkFromMap.put(from, Boolean.valueOf(value));
            getDialogLinkLiveData().postValue(this.dialogLinkFromMap);
        } else if (contains(from)) {
            this.dialogLinkFromMap.put(from, Boolean.valueOf(value));
            getDialogLinkLiveData().postValue(this.dialogLinkFromMap);
        }
    }
}
