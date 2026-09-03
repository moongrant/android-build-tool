package p669o0oooOOo;

import android.util.Log;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;
import org.jetbrains.annotations.NotNull;
import p708oo000o.Oooo0;

/* JADX INFO: loaded from: classes3.dex */
public final class tj extends Handler {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final tj f51929OooO00o = new tj();

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }

    @Override // java.util.logging.Handler
    public final void publish(@NotNull LogRecord record) {
        int i;
        int iMin;
        Intrinsics.checkNotNullParameter(record, "record");
        sj sjVar = sj.f51928OooO0OO;
        String loggerName = record.getLoggerName();
        Intrinsics.checkNotNullExpressionValue(loggerName, "record.loggerName");
        if (record.getLevel().intValue() > Level.INFO.intValue()) {
            i = 5;
        } else {
            i = record.getLevel().intValue() == Level.INFO.intValue() ? 4 : 3;
        }
        String message = record.getMessage();
        Intrinsics.checkNotNullExpressionValue(message, "record.message");
        Throwable thrown = record.getThrown();
        Intrinsics.checkNotNullParameter(loggerName, "loggerName");
        Intrinsics.checkNotNullParameter(message, "message");
        String strTake = sj.f51927OooO0O0.get(loggerName);
        if (strTake == null) {
            strTake = StringsKt___StringsKt.take(loggerName, 23);
        }
        if (Log.isLoggable(strTake, i)) {
            if (thrown != null) {
                StringBuilder sbOooO00o = Oooo0.OooO00o(message, "\n");
                sbOooO00o.append(Log.getStackTraceString(thrown));
                message = sbOooO00o.toString();
            }
            int i2 = 0;
            int length = message.length();
            while (i2 < length) {
                int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) message, '\n', i2, false, 4, (Object) null);
                if (iIndexOf$default == -1) {
                    iIndexOf$default = length;
                }
                while (true) {
                    iMin = Math.min(iIndexOf$default, i2 + 4000);
                    String strSubstring = message.substring(i2, iMin);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    Log.println(i, strTake, strSubstring);
                    if (iMin >= iIndexOf$default) {
                        break;
                    } else {
                        i2 = iMin;
                    }
                }
                i2 = iMin + 1;
            }
        }
    }
}
