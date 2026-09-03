package com.yalla.yalla.developer.crash;

import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.lifecycle.ViewModelKt;
import com.code.android.util.Oooo000;
import com.code.android.util.o000O00O;
import java.io.File;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p394o0Oo0.OooOO0;
import p418o0Oo0ooO.b4;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002R4\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/yalla/yalla/developer/crash/CrashListViewModel;", "Lo0Oo0/OooOO0;", "", "loadCrashFiles", "clearFiles", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "Lkotlin/Pair;", "", "Ljava/io/File;", "listLiveData", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "getListLiveData", "()Landroidx/compose/runtime/snapshots/SnapshotStateList;", "setListLiveData", "(Landroidx/compose/runtime/snapshots/SnapshotStateList;)V", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class CrashListViewModel extends OooOO0 {
    public static final int $stable = 8;

    @NotNull
    private SnapshotStateList<Pair<String, File>> listLiveData = SnapshotStateKt.mutableStateListOf();

    @DebugMetadata(c = "com.yalla.yalla.developer.crash.CrashListViewModel$loadCrashFiles$1", f = "CrashListViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nCrashListViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CrashListViewModel.kt\ncom/yalla/yalla/developer/crash/CrashListViewModel$loadCrashFiles$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,32:1\n1855#2,2:33\n*S KotlinDebug\n*F\n+ 1 CrashListViewModel.kt\ncom/yalla/yalla/developer/crash/CrashListViewModel$loadCrashFiles$1\n*L\n22#1:33,2\n*E\n"})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CrashListViewModel.this.new OooO00o(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x0061  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            String filePath;
            boolean z;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            CrashListViewModel crashListViewModel = CrashListViewModel.this;
            crashListViewModel.getListLiveData().clear();
            b4 b4Var = b4.f46576OooO00o;
            for (File file : Oooo000.OooO0OO(b4.OooO00o(o000O00O.OooO00o()))) {
                SnapshotStateList<Pair<String, File>> listLiveData = crashListViewModel.getListLiveData();
                if (file == null) {
                    filePath = "";
                } else {
                    filePath = file.getAbsolutePath();
                    Intrinsics.checkNotNullExpressionValue(filePath, "getAbsolutePath(...)");
                    Intrinsics.checkNotNullParameter(filePath, "filePath");
                    if (filePath == null) {
                        z = true;
                        break;
                    }
                    int length = filePath.length();
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            z = true;
                            break;
                        }
                        if (!Character.isWhitespace(filePath.charAt(i))) {
                            z = false;
                            break;
                        }
                        i++;
                    }
                    if (z) {
                        filePath = "";
                    } else {
                        String separator = File.separator;
                        Intrinsics.checkNotNullExpressionValue(separator, "separator");
                        int iLastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default(filePath, separator, 0, false, 6, (Object) null);
                        if (iLastIndexOf$default != -1) {
                            filePath = filePath.substring(iLastIndexOf$default + 1);
                            Intrinsics.checkNotNullExpressionValue(filePath, "this as java.lang.String).substring(startIndex)");
                        }
                    }
                }
                listLiveData.add(0, new Pair<>(filePath, file));
            }
            return Unit.INSTANCE;
        }
    }

    public final void clearFiles() {
        b4 b4Var = b4.f46576OooO00o;
        File fileOooO00o = Oooo000.OooO00o(b4.OooO00o(o000O00O.OooO00o()));
        if (fileOooO00o != null && fileOooO00o.exists() && fileOooO00o.isFile()) {
            fileOooO00o.delete();
        }
        loadCrashFiles();
    }

    @NotNull
    public final SnapshotStateList<Pair<String, File>> getListLiveData() {
        return this.listLiveData;
    }

    public final void loadCrashFiles() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new OooO00o(null), 2, null);
    }

    public final void setListLiveData(@NotNull SnapshotStateList<Pair<String, File>> snapshotStateList) {
        Intrinsics.checkNotNullParameter(snapshotStateList, "<set-?>");
        this.listLiveData = snapshotStateList;
    }
}
