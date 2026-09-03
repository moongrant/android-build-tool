package com.yalla.yalla.ui.activity.room;

import android.text.Editable;
import android.text.TextWatcher;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;
import p641o0ooOOOO.l8;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 VoteGameCreateActivity.kt\ncom/yalla/yalla/ui/activity/room/VoteGameCreateActivity\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,97:1\n178#2,5:98\n71#3:103\n77#4:104\n*E\n"})
public final class o0OO0o implements TextWatcher {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ l8 f26931OooO0Oo;

    public o0OO0o(l8 l8Var) {
        this.f26931OooO0Oo = l8Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(@Nullable Editable editable) {
        l8 l8Var = this.f26931OooO0Oo;
        if (StringsKt.isBlank(l8Var.f58373OooO0O0.getText().toString())) {
            Editable text = l8Var.f58373OooO0O0.getText();
            Intrinsics.checkNotNullExpressionValue(text, "dialogBinding.etVoteSetTitle.text");
            if (text.length() > 0) {
                l8Var.f58373OooO0O0.setText("");
            }
        }
        l8Var.f58374OooO0OO.setText(l8Var.f58373OooO0O0.getText().toString().length() + "/60");
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
    }
}
