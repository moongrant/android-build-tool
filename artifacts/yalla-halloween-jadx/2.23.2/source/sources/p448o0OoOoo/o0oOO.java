package p448o0OoOoo;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.yalla.yalla.model.SquareEventRoomModel;
import com.yalla.yalla.module.event.ui.screen.EventRoomPreviewScreen;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import o0oo0000.OooO00o;

/* JADX INFO: loaded from: classes4.dex */
public final class o0oOO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ SquareEventRoomModel f47508OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ SnapshotStateList<SquareEventRoomModel> f47509OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0oOO(SquareEventRoomModel squareEventRoomModel, SnapshotStateList<SquareEventRoomModel> snapshotStateList) {
        super(0);
        this.f47508OooO0Oo = squareEventRoomModel;
        this.f47509OooO0o0 = snapshotStateList;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        OooO00o.OooO0O0("101079");
        EventRoomPreviewScreen eventRoomPreviewScreen = EventRoomPreviewScreen.INSTANCE;
        long roomId = this.f47508OooO0Oo.getRoomId();
        ArrayList<SquareEventRoomModel> arrayList = new ArrayList<>();
        SnapshotStateList<SquareEventRoomModel> snapshotStateList = this.f47509OooO0o0;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(snapshotStateList.get(i));
        }
        eventRoomPreviewScreen.navigate(roomId, arrayList);
        return Unit.INSTANCE;
    }
}
