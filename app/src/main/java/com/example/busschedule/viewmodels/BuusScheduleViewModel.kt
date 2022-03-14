package database.viewmodels

import androidx.lifecycle.ViewModel
import database.Schedule.Schedule
import database.Schedule.ScheduleDao

class BusScheduleViewModel(private val scheduleDao: ScheduleDao): ViewModel() {

    fun fullSchedule(): List<Schedule> = scheduleDao.getAll()

    fun scheduleForStopName(name: String): List<Schedule> = scheduleDao.getByStopName(name)
}