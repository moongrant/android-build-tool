package com.didichuxing.doraemonkit.kit.core;

import android.app.Activity;
import android.view.View;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.NativeProtocol;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\bf\u0018\u00002\u00020\u0001J8\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u000bH&¨\u0006\f"}, d2 = {"Lcom/didichuxing/doraemonkit/kit/core/McClientProcessor;", "", "process", "", "activity", "Landroid/app/Activity;", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "eventType", "", NativeProtocol.WEB_DIALOG_PARAMS, "", "dokit-no-op_release"}, k = 1, mv = {1, 4, 2})
public interface McClientProcessor {
    void process(@Nullable Activity activity, @Nullable View view, @NotNull String eventType, @NotNull Map<String, String> params);
}
