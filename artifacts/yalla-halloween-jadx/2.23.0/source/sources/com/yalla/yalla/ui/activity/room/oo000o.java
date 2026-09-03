package com.yalla.yalla.ui.activity.room;

import android.widget.EditText;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oo000o extends Lambda implements Function2<Boolean, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ CreateRoomActivity f26957OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo000o(CreateRoomActivity createRoomActivity) {
        super(2);
        this.f26957OooO0Oo = createRoomActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Boolean bool, Integer num) {
        boolean zBooleanValue = bool.booleanValue();
        num.intValue();
        if (!zBooleanValue) {
            CreateRoomActivity createRoomActivity = this.f26957OooO0Oo;
            EditText editText = createRoomActivity.f26503OooOOo;
            EditText editText2 = null;
            if (editText == null) {
                Intrinsics.throwUninitializedPropertyAccessException("etRoomName");
                editText = null;
            }
            editText.clearFocus();
            EditText editText3 = createRoomActivity.f26507OooOo0;
            if (editText3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("etRoomAnno");
            } else {
                editText2 = editText3;
            }
            editText2.clearFocus();
        }
        return Unit.INSTANCE;
    }
}
