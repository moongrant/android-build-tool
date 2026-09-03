package com.yalla.yalla.ui.activity.room;

import android.text.Editable;
import android.text.TextWatcher;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;
import p405o0Oo0OOO.z;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 VoteGameCreateActivity.kt\ncom/yalla/yalla/ui/activity/room/VoteGameCreateActivity\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,97:1\n178#2,5:98\n71#3:103\n77#4:104\n*E\n"})
public final class o0O implements TextWatcher {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ z f26438OooO0Oo;

    public o0O(z zVar) {
        this.f26438OooO0Oo = zVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(@Nullable Editable editable) {
        z zVar = this.f26438OooO0Oo;
        if (StringsKt.isBlank(zVar.f45720OooO0O0.getText().toString())) {
            Editable text = zVar.f45720OooO0O0.getText();
            Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
            if (text.length() > 0) {
                zVar.f45720OooO0O0.setText("");
            }
        }
        zVar.f45721OooO0OO.setText(zVar.f45720OooO0O0.getText().toString().length() + "/60");
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
    }
}
