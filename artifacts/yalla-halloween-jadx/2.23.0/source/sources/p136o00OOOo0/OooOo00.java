package p136o00OOOo0;

import com.facebook.share.internal.ShareInternalUtility;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137o00OOOoO.OooO0OO;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.code.android.cloudfilemanager.CloudFileManager$uploadFiles$2", f = "CloudFileManager.kt", i = {1, 1, 1, 1, 1, 1}, l = {109, 124}, m = "invokeSuspend", n = {"uploadInfo", "uploadRequest", "mutableList", ShareInternalUtility.STAGING_PARAM, "uploadResult", "index$iv"}, s = {"L$0", "L$1", "L$2", "L$7", "L$8", "I$0"})
@SourceDebugExtension({"SMAP\nCloudFileManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CloudFileManager.kt\ncom/code/android/cloudfilemanager/CloudFileManager$uploadFiles$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,191:1\n1864#2,3:192\n1#3:195\n*S KotlinDebug\n*F\n+ 1 CloudFileManager.kt\ncom/code/android/cloudfilemanager/CloudFileManager$uploadFiles$2\n*L\n114#1:192,3\n*E\n"})
public final class OooOo00 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<OooO0OO>>, Object> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public Boolean f37406OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public OooOo f37407OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public List f37408OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public OooO0OO f37409OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public OooOO0 f37410OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public Object f37411OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public Iterator f37412OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public File f37413OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public String f37414OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public int f37415OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f37416OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f37417OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final /* synthetic */ List<File> f37418OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final /* synthetic */ Object f37419OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final /* synthetic */ OooOO0<Object> f37420OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final /* synthetic */ Long f37421OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final /* synthetic */ boolean f37422OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final /* synthetic */ Boolean f37423OooOo00;

    public static final class OooO00o extends Lambda implements Function3<Integer, Integer, Long, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ OooO0OO f37424OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(OooO0OO oooO0OO) {
            super(3);
            this.f37424OooO0Oo = oooO0OO;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(Integer num, Integer num2, Long l) {
            int iIntValue = num.intValue();
            int iIntValue2 = num2.intValue();
            long jLongValue = l.longValue();
            OooO0OO oooO0OO = this.f37424OooO0Oo;
            oooO0OO.f37356OooO0Oo = iIntValue;
            oooO0OO.f37358OooO0o0 = iIntValue2;
            oooO0OO.f37357OooO0o = jLongValue;
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo00(OooOO0 oooOO1, Boolean bool, Long l, Object obj, List list, Continuation continuation, boolean z) {
        super(2, continuation);
        this.f37418OooOOOo = list;
        this.f37420OooOOo0 = oooOO1;
        this.f37419OooOOo = obj;
        this.f37421OooOOoo = l;
        this.f37423OooOo00 = bool;
        this.f37422OooOo0 = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        List<File> list = this.f37418OooOOOo;
        OooOO0<Object> oooOO1 = this.f37420OooOOo0;
        Object obj2 = this.f37419OooOOo;
        return new OooOo00(oooOO1, this.f37423OooOo00, this.f37421OooOOoo, obj2, list, continuation, this.f37422OooOo0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<OooO0OO>> continuation) {
        return ((OooOo00) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x008a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0092  */
    /* JADX WARN: Code duplicated, block: B:30:0x009d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x009e  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:43:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:54:0x0131  */
    /* JADX WARN: Code duplicated, block: B:56:0x0138  */
    /* JADX WARN: Code duplicated, block: B:58:0x013c  */
    /* JADX WARN: Code duplicated, block: B:60:0x0146 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:62:0x0148  */
    /* JADX WARN: Code duplicated, block: B:82:0x0186  */
    /* JADX WARN: Code duplicated, block: B:84:0x018f  */
    /* JADX WARN: Code duplicated, block: B:88:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:90:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:92:0x01d2  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00f7 -> B:100:0x0104). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x011f -> B:52:0x0124). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p136o00OOOo0.OooOo00.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
