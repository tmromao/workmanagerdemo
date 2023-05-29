package com.example.workmanagerdemo

import android.content.Context
import androidx.work.Worker
import androidx.work.WorkerParameters

class CustomWorker(
    context: Context,
    workerParameters: WorkerParameters
): Worker(context,workerParameters)
{
    override fun doWork(): Result {
        println("Hello from Worker!")
        return Result.success()
    }

}