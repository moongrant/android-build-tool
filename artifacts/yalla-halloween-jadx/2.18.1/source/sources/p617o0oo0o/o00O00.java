package p617o0oo0o;

import com.yalla.yalla.model.TaskModel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O00 extends Lambda implements Function1<TaskModel, Boolean> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public static final o00O00 f48548Oooo0o = new o00O00();

    public o00O00() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(TaskModel taskModel) {
        TaskModel it = taskModel;
        Intrinsics.checkNotNullParameter(it, "it");
        boolean z = true;
        if (it.getNum() != -1 && (it.getState() != 2 || it.isOneTime() != 1)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
