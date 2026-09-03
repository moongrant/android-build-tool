package p544o0o0OoOO;

import android.widget.EditText;
import com.yalla.yalla.ui.activity.room.CreateRoomActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class l3 extends Lambda implements Function2<Boolean, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ CreateRoomActivity f44266Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(CreateRoomActivity createRoomActivity) {
        super(2);
        this.f44266Oooo0o = createRoomActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Boolean bool, Integer num) {
        boolean zBooleanValue = bool.booleanValue();
        num.intValue();
        if (!zBooleanValue) {
            EditText editText = this.f44266Oooo0o.f22776OoooOoO;
            EditText editText2 = null;
            if (editText == null) {
                Intrinsics.throwUninitializedPropertyAccessException("etRoomName");
                editText = null;
            }
            editText.clearFocus();
            EditText editText3 = this.f44266Oooo0o.f22779Ooooo0o;
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
