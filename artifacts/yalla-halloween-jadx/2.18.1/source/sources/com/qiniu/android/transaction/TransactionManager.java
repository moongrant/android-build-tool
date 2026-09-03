package com.qiniu.android.transaction;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes2.dex */
public class TransactionManager {
    private static final TransactionManager transactionManager = new TransactionManager();
    private Timer timer;
    private ConcurrentLinkedQueue<Transaction> transactionList = new ConcurrentLinkedQueue<>();
    private long time = 0;

    private TransactionManager() {
    }

    private synchronized void createTimer() {
        if (this.timer != null) {
            return;
        }
        Timer timer = new Timer();
        this.timer = timer;
        timer.schedule(new TimerTask() { // from class: com.qiniu.android.transaction.TransactionManager.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                TransactionManager.this.timerAction();
            }
        }, 0L, 1000L);
    }

    public static TransactionManager getInstance() {
        return transactionManager;
    }

    private void handleAllTransaction() {
        for (Transaction transaction : this.transactionList) {
            handleTransaction(transaction);
            if (transaction.maybeCompleted(this.time)) {
                removeTransaction(transaction);
            }
        }
    }

    private void handleTransaction(Transaction transaction) {
        transaction.handleAction(this.time);
    }

    private void invalidateTimer() {
        this.timer.cancel();
        this.timer = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void timerAction() {
        this.time++;
        handleAllTransaction();
    }

    public void addTransaction(Transaction transaction) {
        if (transaction == null) {
            return;
        }
        this.transactionList.add(transaction);
        createTimer();
    }

    public synchronized void destroyResource() {
        invalidateTimer();
        this.transactionList.clear();
    }

    public boolean existTransactionsForName(String str) {
        String str2;
        for (Transaction transaction : this.transactionList) {
            if ((str == null && transaction.name == null) || (str != null && (str2 = transaction.name) != null && str2.equals(str))) {
                return true;
            }
        }
        return false;
    }

    public synchronized void performTransaction(Transaction transaction) {
        if (transaction == null) {
            return;
        }
        if (!this.transactionList.contains(transaction)) {
            this.transactionList.add(transaction);
        }
        transaction.actionTime = this.time;
    }

    public void removeTransaction(Transaction transaction) {
        if (transaction == null) {
            return;
        }
        this.transactionList.remove(transaction);
    }

    public ArrayList<Transaction> transactionsForName(String str) {
        String str2;
        ArrayList<Transaction> arrayList = new ArrayList<>();
        for (Transaction transaction : this.transactionList) {
            if ((str == null && transaction.name == null) || (str != null && (str2 = transaction.name) != null && str2.equals(str))) {
                arrayList.add(transaction);
            }
        }
        return arrayList;
    }

    public static class Transaction {
        private static int TransactionTypeNormal = 0;
        private static int TransactionTypeTime = 1;
        public final Runnable actionHandler;
        private long actionTime;
        public final int after;
        private final int interval;
        public final String name;
        private final int type;

        public Transaction(String str, int i, Runnable runnable) {
            this.type = TransactionTypeNormal;
            this.name = str;
            this.after = i;
            this.interval = 0;
            this.actionHandler = runnable;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void handleAction(long j) {
            if (shouldAction(j)) {
                Runnable runnable = this.actionHandler;
                if (runnable != null) {
                    runnable.run();
                }
                int i = this.type;
                if (i == TransactionTypeNormal) {
                    this.actionTime = 0L;
                } else if (i == TransactionTypeTime) {
                    this.actionTime = j + ((long) this.interval);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean maybeCompleted(long j) {
            return shouldAction(j) && this.type == TransactionTypeNormal;
        }

        private boolean shouldAction(long j) {
            return j >= this.actionTime;
        }

        public Transaction(String str, int i, int i2, Runnable runnable) {
            this.type = TransactionTypeTime;
            this.name = str;
            this.after = i;
            this.interval = i2;
            this.actionHandler = runnable;
        }
    }
}
