package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p156o00OoOO.OooOo00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/yalla/yalla/model/MoreModel;", "Lo00OoOO/OooOo00;", "", "getShowText", ViewHierarchyConstants.TEXT_KEY, "Ljava/lang/String;", "Lcom/yalla/yalla/model/MoreTag;", ViewHierarchyConstants.TAG_KEY, "Lcom/yalla/yalla/model/MoreTag;", "getTag", "()Lcom/yalla/yalla/model/MoreTag;", "<init>", "(Ljava/lang/String;Lcom/yalla/yalla/model/MoreTag;)V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public final class MoreModel implements OooOo00 {
    public static final int $stable = 0;

    @NotNull
    private final MoreTag tag;

    @NotNull
    private final String text;

    public MoreModel(@NotNull String text, @NotNull MoreTag tag) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.text = text;
        this.tag = tag;
    }

    @Override // p156o00OoOO.OooOo00
    @NotNull
    /* JADX INFO: renamed from: getShowText, reason: from getter */
    public String getText() {
        return this.text;
    }

    @NotNull
    public final MoreTag getTag() {
        return this.tag;
    }
}
