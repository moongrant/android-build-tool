package p369o0OOo0o;

import androidx.lifecycle.MutableLiveData;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nEmojiEditText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmojiEditText.kt\ncom/yalla/support/emojifaceutil/EmojiEditTextHelper\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,293:1\n13374#2,3:294\n*S KotlinDebug\n*F\n+ 1 EmojiEditText.kt\ncom/yalla/support/emojifaceutil/EmojiEditTextHelper\n*L\n260#1:294,3\n*E\n"})
public final class OooOO0O {
    @NotNull
    public static ArrayList OooO00o(@NotNull CharSequence text) {
        Intrinsics.checkNotNullParameter(text, "text");
        Matcher matcher = OooOOO.f43161OooO0Oo.matcher(text);
        ArrayList arrayList = new ArrayList();
        while (matcher.find()) {
            String strGroup = matcher.group();
            Intrinsics.checkNotNull(strGroup);
            MutableLiveData<List<OooOOO0>> mutableLiveData = OooOOO.f43158OooO00o;
            if (OooOOO.OooO0O0(StringsKt__StringsKt.removeSuffix(strGroup, (CharSequence) "_")) != null) {
                arrayList.add(new Pair(Integer.valueOf(matcher.start()), Integer.valueOf(matcher.end())));
            }
        }
        return arrayList;
    }
}
