package p619o0oo0o;

import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.adapter.message.MessageModelHeadType;
import com.yalla.yalla.model.SystemConversationModel;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class o0000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public List<SystemConversationModel> f48487OooO00o = new ArrayList();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final SystemConversationModel f48488OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final SystemConversationModel f48489OooO0OO;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MessageModelHeadType.values().length];
            iArr[MessageModelHeadType.TypeSystem.ordinal()] = 1;
            iArr[MessageModelHeadType.TypeYallaTeam.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<com.yalla.yalla.model.SystemConversationModel>] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.ArrayList, java.util.List<com.yalla.yalla.model.SystemConversationModel>] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList, java.util.List<com.yalla.yalla.model.SystemConversationModel>] */
    public o0000() {
        SystemConversationModel systemConversationModel = new SystemConversationModel(MessageModelHeadType.TypeSystem);
        this.f48488OooO0O0 = systemConversationModel;
        SystemConversationModel systemConversationModel2 = new SystemConversationModel(MessageModelHeadType.TypeYallaTeam);
        this.f48489OooO0OO = systemConversationModel2;
        this.f48487OooO00o.clear();
        this.f48487OooO00o.add(systemConversationModel);
        this.f48487OooO00o.add(systemConversationModel2);
    }
}
